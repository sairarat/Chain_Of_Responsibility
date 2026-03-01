public class WasteManagement {
    public static void main(String[] args) {
        // Initialize Collectors
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        // Chain: Organic -> Recyclable -> Hazardous
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        WasteContainer[] bins = {
                new WasteContainer("organic", 25, true),
                new WasteContainer("recyclable", 40, true),
                new WasteContainer("hazardous", 5, true),
                new WasteContainer("electronic", 15, true)
        };

        System.out.println("--- Starting Automated Waste Collection ---");
        for (WasteContainer bin : bins) {
            organic.processWaste(bin);
        }
    }
}