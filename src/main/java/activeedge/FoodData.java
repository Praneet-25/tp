package activeedge;

/**
 * The FoodData class stores information about various food items.
 */
public class FoodData {
    /**
     * An array containing data for each food item.
     * Each element is an array with two elements: food name and calories.
     */
    public static String[][] foodItems = {
            {"fried chicken", "543"},
            {"chicken burger", "357"},
            {"beef burger", "500"},
            {"fish burger", "379"},
            {"cheese pizza", "220"},
            {"chicken pizza", "310"},
            {"vegeterian pizza", "280"},
            {"french fries", "365"},
            {"potato wedges", "123"},
            {"steak", "679"},
            {"tomato sauce pasta", "380"},
            {"carbonara pasta", "574"},
            {"alfredo pasta", "500"},
            {"chicken chop", "202"},
            {"lamb chop", "294"},
            {"fish and chips", "765"},
            {"caeser salad", "94"},
            {"garden salad", "20"},
            {"BLT sandwich", "344"},
            {"egg mayo sandwich", "485"},
            {"ham and cheese sandwich", "352"},
            {"roast beef sandwich", "351"},
            {"chicken wings", "400"},
            {"pancakes", "350"},
            {"hotdog", "250"},
            {"cheese baked rice", "450"},
            {"idly", "58"},
            {"dosa", "123"},
            {"sambar rice", "187"},
            {"rasam rice", "151"},
            {"samosa", "222"},
            {"medu vadai", "108"},
            {"paneer masala", "360"},
            {"chicken masala", "650"},
            {"channa masala", "193"},
            {"chapati", "169"},
            {"prata", "122"},
            {"egg prata", "289"},
            {"egg biryani", "580"},
            {"chicken biryani", "753"},
            {"vegeterian biryani", "532"},
            {"mutton biryani", "927"},
            {"fish biryani", "599"},
            {"prawn biryani", "585"},
            {"plain naan", "262"},
            {"butter naan", "303"},
            {"fish curry", "309"},
            {"pulao", "510"},
            {"lemon rice", "516"},
            {"curd rice", "310"},
            {"katsu don", "700"},
            {"sushi", "350"},
            {"sashimi", "300"},
            {"miso soup", "70"},
            {"yakitori", "160"},
            {"gyoza", "250"},
            {"tempura", "400"},
            {"takoyaki", "200"},
            {"okonomiyaki", "650"},
            {"yakisoba", "500"},
            {"nikujaga", "400"},
            {"sukiyaki", "500"},
            {"tonkatsu", "600"},
            {"curry rice", "600"},
            {"ramen", "600"},
            {"udon", "400"},
            {"soba", "300"},
            {"edamame", "120"},
            {"kung pao shrimp", "500"},
            {"dan dan noodles", "450"},
            {"char siu bao", "350"},
            {"twice cooked pork", "600"},
            {"egg fried rice", "350"},
            {"wontons in spicy sauce", "350"},
            {"chow mein", "400"},
            {"kung pao chicken", "500"},
            {"dumplings", "300"},
            {"peking duck", "600"},
            {"xiao long bao", "250"},
            {"yangzhou fried rice", "450"},
            {"congee", "200"},
            {"stir fried eggplant with garlic sauce", "200"},
            {"spring rolls", "300"},
            {"sweet and sour pork", "500"},
            {"kung pao beef", "500"},
            {"chinese broccoli with oyster sauce", "250"},
            {"stir fried greens with garlic", "200"},
            {"Moo Shu Pork", "500"},
            {"nasi lemak", "650"},
            {"rendang", "350"},
            {"satay", "300"},
            {"mee goreng", "350"},
            {"nasi goreng", "450"},
            {"laksa", "450"},
            {"otak otak", "150"},
            {"ayam goreng", "250"},
            {"sambal belacan", "75"},
            {"ikan bilis sambal", "100"},
            {"acar", "75"},
            {"roti jala", "90"},
            {"sayur goreng", "75"},
            {"sambal tempeh", "125"},
            {"telur masin", "85"},
            {"goreng pisang", "125"},
            {"keopok goreng", "125"},
            {"tahu goreng", "125"},
            {"fish curry", "200"},
            {"chicken curry", "200"},
            {"bergedil", "120"},
            {"samosa", "100"},
            {"curry puff", "150"},
            {"mee siam", "350"},
            {"ayam penyet", "350"},
            {"sambal goreng", "250"},
            {"udang sambal", "250"},
            {"kimchi", "25"},
            {"bibimbap", "600"},
            {"bulgogi", "300"},
            {"japchae", "350"},
            {"kimchi jjigae", "250"},
            {"tteokbokki", "275"},
            {"samgyeopsal", "300"},
            {"korean sweet potato", "90"},
            {"korean radish", "20"},
            {"seaweed", "25"},
            {"soy sauce tofu", "65"},
            {"korean fried chicken", "350"},
            {"kimbap", "350"},
            {"tangsuyuk", "350"},
            {"gimbap", "175"},
            {"galbi", "350"},
            {"soybean sprouts", "35"},
            {"anchovy", "200"},
            {"perilla leaves", "45"},
            {"korean chilli peppers", "45"},
            {"gyeran jjim", "125"},
            {"gyeran mari", "125"},
            {"pajeon", "250"},
            {"black coffee", "0"},
            {"diet soda", "10"},
            {"almond milk", "45"},
            {"soy milk", "95"},
            {"skim plain milk", "80"},
            {"orange juice", "115"},
            {"apple juice", "115"},
            {"craneberry juice", "115"},
            {"lemonade", "125"},
            {"energy drink", "150"},
            {"wine", "120"},
            {"hot chocolate", "175"},
            {"tea", "85"},
            {"coffee", "75"},
            {"oat milk", "130"},
            {"frappucino", "350"},
            {"smoothie", "225"},
            {"protein shake", "175"},
            {"mango juice", "125"},
            {"milkshake", "115"},
            {"beer", "150"},
            {"peking duck", "350"},
            {"sichuan hotpot beef", "450"},
            {"steamed dumplings", "80"},
            {"chicken rice", "450"},
            {"chow fun", "350"},
            {"fried rice", "450"},
            {"steamed fish", "300"},
            {"char siu", "250"},
            {"mapo tofu", "250"},
            {"rice with vegetables", "300"},
            {"rice with meat", "400"},
            {"scallion pancakes", "200"},
            {"pork barbeque ribs", "350"},
            {"fishball noodle", "150"},
            {"mushroom minced meat noodle", "200"},
            {"wanton mee", "200"},
            {"red chilli crab", "350"},
            {"abalone", "400"},
            {"mee soup", "200"},
            {"pakoras", "282"},
            {"aloo tikki", "183"},
            {"bhel puri", "198"},
            {"pani puri", "127"},
            {"bhajiya", "228"},
            {"kachori", "307"},
            {"dhokla", "129"},
            {"masala papad", "87"},
            {"chole bhature", "614"},
            {"pav bhaji", "458"},
            {"vada pav", "358"},
            {"misal pav", "389"},
            {"chakli", "77"},
            {"upma", "287"},
            {"masala dosa", "409"},
            {"bread pakora", "257"},
            {"samosa chaat", "328"},
            {"momo", "278"},
            {"sev puri", "229"},
            {"khandvi", "137"},
            {"lontong", "300"},
            {"murtabak", "400"},
            {"nasi kerabu", "450"},
            {"pulut panggang", "250"},
            {"kuih lapis", "200"},
            {"rojak", "250"},
            {"ketupat", "150"},
            {"sambal udang", "180"},
            {"ikan bakar", "350"},
            {"nasi dagang", "400"},
            {"pecal", "200"},
            {"lemang", "300"},
            {"pisang goreng cheese", "300"},
            {"roti canai", "300"},
            {"kuih dadar", "150"},
            {"asam pedas", "200"},
            {"soto ayam", "300"},
            {"ayam percik", "350"},
            {"sambal telur", "120"},
            {"kuih keria", "250"}
    };

    /**
     * Prints the calories of each food item in the foodItems array.
     */
    public static void printFood() {
        for (int i = 0; i < foodItems.length; i++) {
            // Concatenate the food name, calories, and "kcal" in the same line
            String foodInfo = "Meal: " + foodItems[i][0] + " | Calories per serving: " + foodItems[i][1] + " kcal";
            System.out.println(foodInfo);

            // Assert that the calorie value is a valid integer
            try {
                int calorieValue = Integer.parseInt(foodItems[i][1]);
                assert calorieValue >= 0 : "Calorie value must be non-negative";
            } catch (NumberFormatException e) {
                System.err.println("Invalid calorie value for food item: " + foodItems[i][0]);
            }
        }
    }

    /**
     * Checks if a food item with the given description already exists in the list of food items.
     * @param description The description of the food item to check.
     * @return true if the food item exists, false otherwise.
     */

    public static boolean foodItemExists(String description) {
        for (String[] foodItem : foodItems) {
            if (foodItem[0].equalsIgnoreCase(description)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Appends a new item to the original array.
     *
     * @param originalArray The original array to which the new item will be appended.
     * @param newItem       The new item to be appended in the format [food name, calories].
     * @return The new array with the new item appended.
     */
    public static String[][] appendItem(String[][] originalArray, String[] newItem) {
        // Create a new array with one more row than the original
        String[][] newArray = new String[originalArray.length + 1][2]; // Assuming each item has 2 elements

        // Copy the contents of the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Add the new item to the last position of the new array
        newArray[newArray.length - 1] = newItem;

        return newArray;
    }
}
