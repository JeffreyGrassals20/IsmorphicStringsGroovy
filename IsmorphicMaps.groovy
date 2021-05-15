class Ismorphic{


        def boolean IsIsmorphic (String str1, String str2){
            
            int x = str1.length() 
            int y = str2.length() 

            if(x != y)
             return false 

            int size = 256 
            def mp1 = [:]  
            def mp2 = [:]

            for(int i = 0; i < size ; i++){
                mp1.put(i,-1)
                mp2.put(i,false) 

            }

            for(int i = 0; i < y; i++)
            {
                int x1 = (int)str1.getAt(i)
                int y1 = (int)str2.getAt(i) 

                if(mp1.get(x1) == -1)
                {
                    if(mp2.get(y1) == true)
                        return false
                    mp2.put(x1,true)
                    mp1.put(x1,y1)
                }else if(mp1.getAt(x1) != y1)
                {
                    return false
                }
              
            }            

            
            return true

        }

    static void main (args){
            Ismorphic a  = new Ismorphic();

            println(a.IsIsmorphic("aab","xxy"))
    }
}