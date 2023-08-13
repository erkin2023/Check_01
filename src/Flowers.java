public class Flowers {
       String flowerName;
        int freshness;
        int price;

        public Flowers(String flowerName, int price) {
            this.flowerName = flowerName;
            this.price = price;

        }

        @Override
        public String toString() {
            return "Flowers{" +
                    "flowerName='" + flowerName + '\'' +
                    ", freshness='" + freshness + " out of 10'" +
                    ", price=" + price +
                    '}';
        }
        public static String checkFreshness(Flowers[] flowers) {
            System.out.println("Свежесть цветов:");
            int maxfreshness = flowers[0].freshness;
            String name = flowers[0].flowerName;


            // Freshness thresholds
            for (int i = 1; i < flowers.length; i++) {
                if (flowers[i].freshness < maxfreshness) {
                    maxfreshness = flowers[i].freshness;
                    name = flowers[i].flowerName;
                }
            }
            return "Самый свежий цветок: " + name + " по 10 бальной школе : " + maxfreshness;

        }
        public static Flowers minPriceFlower(Flowers[] flowers) {
            System.out.println("минимальный price ");
            Flowers flower = flowers[0];
            for (int i = 0; i < flowers.length; i++) {
                if (flowers[i].price < flower.price) {
                    flower = flowers[i];

                }
            }
            return flower;
        }}

