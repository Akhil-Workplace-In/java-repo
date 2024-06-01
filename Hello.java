class Computer
{
    public void playmusic()
    {
        System.out.println("Music Palying...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)        
            return "Pen";


        return "Nothing"; 
               
        
    }
}


class Hello{
    public static void main(String args[])
    {
        Computer comp = new Computer();
        comp.playmusic();
        String str = comp.getMeAPen(5);
        System.out.println(str);


        
    }

}

