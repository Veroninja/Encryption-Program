// monoalphabetic substitution
public class Cipher
{
    public Cipher()
    {
    }
    
    public String encode(String toCode)
    {
        char original[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
        // array with alphabet (caps and no caps) and numbers in order
        char subbed[] = {'h','R','B','o','y','X','b','1','A','Z','n','x','L','s','d','8','O','3','l','6','4','z','H','c','S','r','m','Y','J','M','a','0','q','C','9','i','P','E','2','Q','v','W','p','K','7','k','5','u','N','g','U','t','D','e','T','w','G','V','j','I','F','f'};
        // array with scrambled alphabet (caps and no caps) and numbers
        
        String coded = "";
        // encrypted string
        
        for (int c = 0; c <= toCode.length()-1; c++) // c = index(es) of original string
        {
           for (int o = 0; o < original.length; o++) // o = indexes of original[]
           {   
               if (toCode.charAt(c) == original[o]) // comparing each character in original string to elements in original[]
               {
                   coded += subbed[o];
                   // when match is found, add element in subbed w/ same index to String coded
               }
           }
        }
        return coded; // once loop ends, internally returns String coded
    }
    
    public String decode(String dCode)
    {
        char original[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
        // array with alphabet (caps and no caps) and numbers in order
        char subbed[] = {'h','R','B','o','y','X','b','1','A','Z','n','x','L','s','d','8','O','3','l','6','4','z','H','c','S','r','m','Y','J','M','a','0','q','C','9','i','P','E','2','Q','v','W','p','K','7','k','5','u','N','g','U','t','D','e','T','w','G','V','j','I','F','f'};
        // array with scrambled alphabet (caps and no caps) and numbers
        
        String dCoded = "";
        // decrypted string
        
        for (int c = 0; c <= dCode.length()-1; c++) // c = indexes of encrypted string
        {
           for (int s = 0; s < subbed.length; s++) // s = indexes of subbed[]
           {   
               if (dCode.charAt(c) == subbed[s]) // comparing each character in encrypted string to elements in original[]
               {
                   dCoded += original[s];
                   // when match is found, add element in subbed w/ same index to String coded
               }
           }
        }
        return dCoded; // once loop ends, internally returns String dCoded
    }
}
