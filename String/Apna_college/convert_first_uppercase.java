package String.Apna_college;

public class convert_first_uppercase {
    public static void main(String[] args) {
        String str ="hi my name is pedri";
        System.out.println(upper(str));
    }

    public static String upper(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)== ' '&& i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
            sb.append(str.charAt(i));;
            }

        }
        return sb.toString();
    }
}
//output
//        Hi My Name Is Pedri