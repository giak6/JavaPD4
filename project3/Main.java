class Main {
    public static void main(String[] args) {
        new Main().init();
    }

    void print(Object o) { System.out.println(o); }

    void init() {

        String original = Input.readFile("Original.txt");

        //GOLD BUG
        char[] sub = {
            'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
        };

        char[] sub2 = {
            '8',';','4','†','‡','*','5','6','7','(',')','_','+','?','¶','%','$','#','!','=',';',',','-','.','/','⌂'
        };

        String goldEncoded = subEncode(original, sub, sub2);
        print("Gold Bug Encoded:");
        print(goldEncoded);


        //VIGENERE CIPHER
        String key = "KEY";
        String vigEncoded = vigenereEncrypt(original, key);
        print("\nVigenere Encoded:");
        print(vigEncoded);


        // RAIL FENCE
        String railEncoded = encode(original);
        print("\nRail Fence Encoded:");
        print(railEncoded);
    }



    // GOLD BUG 
    String subEncode(String s, char[] sub, char[] sub2) {
        s = s.toLowerCase();
        String bld = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = indexOf(ch, sub);
            if (index != -1) bld += sub2[index];
            else bld += ch;
        }
        return bld;
    }

    int indexOf(char ch, char[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == ch) return i;
        return -1;
    }




    // VIGENERE 
    String vigenereEncrypt(String text, String key) {
        text = text.toUpperCase();
        key = key.toUpperCase();
        String bld = "";
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int shift = key.charAt(k) - 'A';
                bld += (char)(((ch - 'A' + shift) % 26) + 'A');
                k = (k + 1) % key.length();
            } else {
                bld += ch;
            }
        }
        return bld;
    }




    // RAIL FENCE 
    String encode(String s) {
        String even = "";
        String odd = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) even += s.charAt(i);
            else odd += s.charAt(i);
        }
        return even + odd;
    }
}
