package Recursion.Apna_college;

public class String_duplcates_remove {
    public static void main(String[] args) {
        String str ="piyushsanjaymali";
        remove_duplicates(str,0,new StringBuilder(" "),new boolean[50]);

    }

    public static void remove_duplicates(String str , int i ,StringBuilder Sb, boolean [] map){
        if(i==str.length()){
            System.out.println(Sb);
            return;
        }
        char curr=str.charAt(i);
        if(map[curr-'a'] == true){
            remove_duplicates(str,i+1,Sb,map);
        }
        else{
            map[curr-'a'] = true;
            remove_duplicates(str,i+1,Sb.append(curr),map);

        }
    }
}
//output
//piyushanjml