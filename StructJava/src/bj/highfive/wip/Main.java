
package bj.highfive.wip;
public class Main {
    public static void main(String[] Args){

        int[]arr = new int[5];
        arr[0]=4;
        arr[1]=8;
        arr[2]=9;
        arr[3]=5;
        arr[4]=4;

        int[]tab ={1,2,5,4,8};

        for(int num:arr){
            if(num==4)continue;
            System.out.println(num);
        }
        for(int num:tab){
            if(num==4)continue;
            
            System.out.println(num);
        }

    

    }
    
    
}
//sout-> System.out.println
//main
//ctor-> constructeur public
// les champs(proprietes) sont à 80% prive
// prf->propriete prive
// public_methode: -> crée une méthode public
// private_methode: -> crée une méthode privée
// public_staic_methode: -> crée une méthode public static
// private_static_methode: -> crée une méthode privée static
// protected_methode: -> crée une méthode protected
// protected_methode: -> crée une méthode protected
//if,ifelse,for,fori,while,dowhile


/*les Tableaux
for(stmt1;stmt2;stmt3){}
for (int num:arr){num}

/* OVERLOAD............... (meme nom de fonction avec parametres différents): il s'effectue dans la meme classe.
Ex:int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
le overload ne peut etre effectué en changeant uniquement le type de retour de la méthode. le type de retour peut etre identique ou different. Mais nous devons aussi changé les parametres.*/ 

/*OVERwrite est utilisée pour fournir une implementation specificique d'une methode déjà fournie dans la superclasse: il s'effectue dans deux classes ayant une relation d'héritage.(les paramètres sont identiques dans ce cas). le type de retour doit etre identique*/

