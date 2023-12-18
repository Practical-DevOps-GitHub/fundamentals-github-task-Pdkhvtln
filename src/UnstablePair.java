/*Some file managers sort filenames taking into account case of the letters, others compare strings as if all of the letters are of the same case. That may lead to different ways of filename ordering.

        Call two filenames an unstable pair if their ordering depends on the case.

        To compare two filenames a and b, find the first position i at which a[i] ≠ b[i]. If a[i] < b[i], then a < b. Otherwise a > b. If such position doesn't exist, the shorter string goes first.

        Given two filenames, check whether they form an unstable pair.*/
public class Main {
    public static boolean solution(String f1, String f2) {
        return (f1.compareTo(f2) < 0) != (f1 .compareToIgnoreCase(f2)<0);
    }
    public static void main(String[] args) {

        //String filename1 = "yyyyyy", filename2 = "Azzzzzzzzz";
        String filename1 = "zzzzzAa123", filename2 = "zzzzza";
        System.out.println(solution(filename1, filename2));

    }
}
