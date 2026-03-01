public class OrganicCollector extends WasteCollector {
    @Override
    public boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("organic");
    }

    @Override
    public void collect(WasteContainer container) {
        System.out.println("Waste Type: Organic...Processing " + container.getCapacity() + "kg of organic waste for composting.");
    }
}

