# gh-action-pkg-repo
** GitHubでActionとPackageRegistryを試してみるリポジトリ

### Memo
* ベースとなるプロジェクトの生成
```console
$ mvn archetype:generate  -DarchetypeArtifactId=maven-archetype-quickstart
〜〜
[INFO] Generating project in Interactive mode
Define value for property 'groupId': work.yk0        
Define value for property 'artifactId': gh-test
Define value for property 'version' 1.0-SNAPSHOT: : 
Define value for property 'package' work.yk0: : work.yk0
Confirm properties configuration:
groupId: work.yk0
artifactId: gh-test
version: 1.0-SNAPSHOT
package: work.yk0.gh-test
 Y: : 
```

* ビルドが通るようにpom.xmlを修正
```xml
このあたりを足す
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
          <source>11</source>
          <target>11</target>
```