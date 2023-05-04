class Box{ 
int width; 
int height; 
int length; 
Box(int w) 
{ 
    width=w; 
    height=w; 
    length=w; 
} 
Box(int w,int h,int l) 
{ 
    width=w; 
    height=h; 
    length=l; 
} 
Box(Box b){ 
    width=b.width+5; 
     height=b.height+5; 
      length=b.length+5; 
 
} 
 
Box(){ 
    width=height=length=6; 
     
} 
 
    public void display() 
    { 
        System.out.println("The height is"+height); 
          System.out.println("The width is"+width); 
            System.out.println("The length is"+length); 
         
    } 
      public int volume() 
    { 
        return width*length*height; 
          
         
    }} 
    class cim extends Box{ 
        int weight; 
     
    cim(){ 
        this.weight=4; 
    } 
    cim(int width,int height,int length,int weight ) { 
super(width, height,length); 
this.weight=weight; 
} 
void show() { 
     System.out.println("The height is"+height); 
          System.out.println("The width is"+width); 
            System.out.println("The length is"+length); 
    System.out.println("the weight is "+weight); 
} 
} 
class New{ 
     
  public static void main(String[] args) 
    { 
       Box p1 = new Box(3,3,3); 
       Box p2 = new Box(8,18,2); 
       Box p3=new Box(); 
       Box p4=new Box(p1); 
         Box p5=new Box(p2); 
       cim c1=new cim(5,5,6,6); 
       c1.show(); 
 
    }}