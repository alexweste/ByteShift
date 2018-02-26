// Programma demonstriruet primenenie ternarnoy operacii ?
class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // poluchit absolutnoe znachenie peremennoy i
        System.out.print("Absolutnoe znachenie ");
        System.out.println(i + " ravno " + k);

        i = -10;
        k = i < 0 ? -i : i; // poluchit absolutnoe znachenie oeremennoy i
        System.out.print("Absolutnoe znachenie ");
        System.out.println(i + " ravno " + k);
    }
}
