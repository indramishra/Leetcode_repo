class Solution {
    public int romanToInt(String s) {
        int romanToInt = 0;
        char[] charArr = s.toCharArray();
        for(int i=0; i < s.length(); i++) {
            
            switch(s.charAt(i)) {
                case 'I':
                    romanToInt +=1;
                    break;
                case 'V':
                    if(i != 0 && charArr[i-1] == 'I') {
                        romanToInt +=3;
                    } else {
                        romanToInt +=5;
                    }
                    break;
                case 'X':
                    if(i != 0 && charArr[i-1] == 'I') {
                        romanToInt +=8;
                    } else {
                        romanToInt +=10;
                    }
                    break;
                case 'L':
                    if(i != 0 && charArr[i-1] == 'X') {
                        romanToInt +=30;
                    } else {
                        romanToInt +=50;
                    }
                    break;
                case 'C':
                    if(i != 0 && charArr[i-1] == 'X') {
                        romanToInt +=80;
                    } else {
                        romanToInt +=100;
                    }
                    break;
                case 'D':
                    if(i != 0 && charArr[i-1] == 'C') {
                        romanToInt +=300;
                    } else {
                        romanToInt +=500;
                    }
                    break;
                case 'M':
                    if(i != 0 && charArr[i-1] == 'C') {
                        romanToInt +=800;
                    } else {
                        romanToInt +=1000;
                    }
                    break;
                default :
                    return romanToInt;
            }
        }
        
        return romanToInt;
        
    }
}