public class Loop4 {
    public static void execute(){
/* 
Be användaren mata in ett tal. Spara värdet i en variabel. Upprepa detta 10 gånger. För

varje gång lägg till det inmatade värdet till variabelns värde. När det är klart skriv ut-
Summan av det du matat in är: summan.

*/         
    
    int summa = 0;
    for(int i= 0; i < 10; i++){
            System.out.println("Ange tal nummer " + (i+1));
            int tal = Integer.parseInt(System.console().readLine());
            summa += tal;
        }
        System.out.println(summa);
    }
}
