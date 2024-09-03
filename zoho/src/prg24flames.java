public class prg24flames {
    public static void main(String[] args) {
        prg24flames obj = new prg24flames();
        String name1 = "alan";
        String name2 = "geetha";
        System.out.println(obj.Flames_games(name1, name2));

    }

    private String Flames_games(String name1, String name2) {
        String temp1 = name1;
        String temp2 = name2;
        int i, j;
        for (i = 0; i < name1.length(); i++) {
            for (j = 0; j < name2.length(); j++) {
                if (name1.charAt(i) == name2.charAt(j)) {
                    name1 = name1.replaceFirst("" + name1.charAt(i), " ");
                    name2 = name1.replaceFirst("" + name2.charAt(j), " ");
                    break;

                }

            }

        }
        String act_input = name1.replaceAll(" ", "") + name2.replaceAll(" ", "");
        String flames = "FLAMES";
        while (flames.length() != 1) {
            int rem_ch = act_input.length() % flames.length();
            if (rem_ch != 0) {
                flames = flames.substring(rem_ch) + flames.substring(0, rem_ch);
            } else {
                flames = flames.substring(0, flames.length() - 1);
            }
        }
        System.out.println(flames);
        String output = "The Relationship is" + temp1 + "and" + temp2 + "will be";
        switch (flames) {
            case "F":
                output += "Friendship";
                break;
            case "L":
                output += "Lover";
                break;
            case "A":
                output += "Affection";
                break;
            case "M":
                output += "Marriage";
                break;
            case "E":
                output += "Enemy";
                break;
            case "S":
                output += "Sister";
                break;
        }
        return output;


    }
}







