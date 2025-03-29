public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String st = "I am a SQA Engineer";
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (char ch : st.toLowerCase().toCharArray()){
            if(vowels.indexOf(ch) == -1){
                sb.append(ch);
            }
        }
        System.out.println("Input: "+st);
        System.out.println("Output: "+ sb.toString());
    }
}
