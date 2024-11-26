public class ConcatenateLists {
    public static void main(String[] args) {
        String[] list1 = {"a", "b", "c"};
        Integer[] list2 = {1, 2, 3};
        Object[] concatenatedList = concatenateLists(list1, list2);
        System.out.print("Concatenated list: ");
        for (Object item : concatenatedList) {
            System.out.print(item + " ");
	}
    }

    public static Object[] concatenateLists(Object[] list1, Object[] list2) {
        int length = list1.length + list2.length;
        Object[] result = new Object[length];
        int index = 0;

        for (Object item : list1) {
            result[index++] = item;
        }

        for (Object item : list2) {
            result[index++] = item;
        }

        return result;
    }
}
