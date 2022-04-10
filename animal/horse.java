
package animal;

class horse extends Animal {

    @Override
    public void sound (){
        System.out.println("Neigh");
    }
    public static void main(String[] args) {
        Animal obj = new horse();
        obj.sound();
    }
    
}
