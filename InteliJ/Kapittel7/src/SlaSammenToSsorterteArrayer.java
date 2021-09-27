
public class SlaSammenToSsorterteArrayer {
    public static void main(String[] args) {
        int[] list1 = {1, 15, 56, 23, 36, 0, 56, 65, 2, 9, 2};
        int[] list2 = {2, 4, 6, 9, 11, 4, 0, 45, 665, 3, 11, 6};
        int[] list3 = merge(list1, list2);

        System.out.println("Programmet slaer sammen to array lister og sorterer:");
        System.out.println("Liste 1: { 1, 15, 56, 23, 36, 0, 56, 65, 2, 9, 2 }");
        System.out.println("Liste 1: { 2, 4, 6, 9, 11, 4, 0, 45, 665, 3, 11, 6 }");
        System.out.print("Resultatet blir: \n{ ");

        for (int value : list3) System.out.printf("%d ", value);
        System.out.println("}");
    }
    private static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, list3, 0, list1.length);
        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            list3[j] = list2[i];
        }
        sort(list3);
        return list3;
    }
    private static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}