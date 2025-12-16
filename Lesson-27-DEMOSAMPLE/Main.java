 class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

char[] sub = new char[26];
sub[0]  = 'a';
sub[1]  = 'b';
sub[2]  = 'c';
sub[3]  = 'd';
sub[4]  = 'e';
sub[5]  = 'f';
sub[6]  = 'g';
sub[7]  = 'h';
sub[8]  = 'i';
sub[9]  = 'j';
sub[10] = 'k';
sub[11] = 'l';
sub[12] = 'm';
sub[13] = 'n';
sub[14] = 'o';
sub[15] = 'p';
sub[16] = 'q';
sub[17] = 'r';
sub[18] = 's';
sub[19] = 't';
sub[20] = 'u';
sub[21] = 'v';
sub[22] = 'w';
sub[23] = 'x';
sub[24] = 'y';
sub[25] = 'z';

char[] sub2 = new char[26];
sub2[0]  = '8';
sub2[1]  = ';';
sub2[2]  = '4';
sub2[3]  = '†';
sub2[4]  = '‡';
sub2[5]  = '*';
sub2[6]  = '5';
sub2[7]  = '6';
sub2[8]  = '7';
sub2[9]  = '(';
sub2[10] = ')';
sub2[11] = '_';
sub2[12] = '+';
sub2[13] = '?';
sub2[14] = '¶';
sub2[15] = '%';
sub2[16] = '$';
sub2[17] = '#';
sub2[18] = '!';
sub2[19] = '=';
sub2[20] = ':';
sub2[21] = ',';
sub2[22] = '-';
sub2[23] = '.';
sub2[24] = '/';
sub2[25] = '⌂';

print ( indexOf("",sub));

String file = Input.readFile("Original.txt");
String encodedMsg = subEncode(file, sub, sub2);
Input.writeFile("encode.txt", encodedMsg);

String decodedMsg = subEncode(encodedMsg, sub2, sub);
Input.wrtieFile("decode.txt", decodedMsg);


}
String subEncode(String s, char[] sub, char[] sub2){
    String bld="";
    char ch = ' ';
    int index = 0;
    for(int x=0; x<= s.lenght()-1; x++){
        ch = s.charAt(x);
        index = indexOf(ch, sub);
        if( index != -1){
            bld+= sub2[index];
        }
    }
}

int indexOf(char ch, char[] arry){
  for(int x=0; x<= arry.length-1; x++){
    if(array[x]== ch){
      return x;
    }
  }
}
    
    // Encoding message
    String file = Input.readFile("test.txt");

    //substituion
    String encodedMsg1 = subEncryption(file,sub,sub2);
    //Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    //Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    String encodedMsg3 = reverse(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    String file2 = Input.readFile("Encode1.txt");
    
    String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }
  // Level 1 reverse string
  String reverse(String txt){
    String bld ="";
    
    return bld;
  }
  
  
  //Level 2 Cipher encoding with no wrapping
  String encode(String txt){
    String bld="";
    
     
    return bld;
  }

  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
   
    return bld;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}