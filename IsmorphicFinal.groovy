class Ismorphic{

   def boolean IsIsmorphic (String str1, String str2){

        int x = str1.length(); 
        int y = str2.length(); 
        
        if(x != y)
           return false

        def lst1 = []
        def lst2 = []
        int size = 256

        for(int i =0; i < 256; i++ )
        {
            lst1.add(-1)
            lst2.add(false)
        }

        for(int i = 0; i < y; i++)
        {
            int x1 = (int)str1.getAt(i)
            int y1 = (int)str2.getAt(i)

            if(lst1[x1] == -1)
            {
                if(lst2[y1] == true)
                    return false 
                lst2[x1] = true
                lst1[x1] = y1;
            }else if(lst1[x1] != y1)
            {
                return false
            }

        }

      return true
   }



    static void main(args){

        Ismorphic a = new Ismorphic(); 

        println(a.IsIsmorphic("paper","title"))

    }
}
