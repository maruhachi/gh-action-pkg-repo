# gh-action-pkg-repo
** GitHubでActionとPackageRegistryを試してみるリポジトリ

### Memo
1. ベースとなるプロジェクトの生成
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

2. ビルドが通るようにpom.xmlを修正
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

3. GithubのRegistryへdeploy
```console
$ mvn clean deploy -s ./maven-settings.xml -DskipTests
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building gh-test 2.0
[INFO] ------------------------------------------------------------------------
〜〜

[INFO]
[INFO] --- maven-deploy-plugin:2.7:deploy (default-deploy) @ gh-test ---
Uploading to github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/2.0/gh-test-2.0.jar
Uploaded to github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/2.0/gh-test-2.0.jar (2.6 kB at 1.5 kB/s)
Uploading to github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/2.0/gh-test-2.0.pom
Uploaded to github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/2.0/gh-test-2.0.pom (1.4 kB at 1.1 kB/s)
Downloading from github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/maven-metadata.xml
Uploading to github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/maven-metadata.xml
Uploaded to github: https://maven.pkg.github.com/maruhachi/gh-action-pkg-repo/work/yk0/gh-test/maven-metadata.xml (291 B at 431 B/s)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 7.545 s
[INFO] Finished at: 2019-09-21T12:15:57+09:00
[INFO] Final Memory: 15M/54M
[INFO] ------------------------------------------------------------------------```