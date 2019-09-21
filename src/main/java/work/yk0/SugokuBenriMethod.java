package work.yk0;

/**
 * This is Sugoku Benri.
 * @author ykonno
 */
public class SugokuBenriMethod
{
    public static void main( String[] args )
    {
        System.out.println( "version 4.0!" );
    }

    /**
     * 近くて便利な引数を受け取り、それがいかに便利であるか返します.
     * @param param 便利な何か
     * @return いかに便利か
     */
    public String benriMethod(String param){
        return "近くて便利、" + param + "！！";
    }

}
