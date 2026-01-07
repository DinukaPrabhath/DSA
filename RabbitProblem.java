class RabbitProblem {
    static int rabbits(int n) {
        if (n == 1 || n == 2)
            return 1;
        return rabbits(n - 1) + rabbits(n - 2);
    }

    public static void main(String[] args) {
        int month = 6;
        System.out.println("Rabbits after " + month + " months = " + rabbits(month));
    }
}




