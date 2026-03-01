public class RecyclableCollector extends WasteCollector {
    @Override
    public boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("recyclable");
    }

    @Override
    public void collect(WasteContainer container) {
        System.out.println("Waste Type: Recyclable......Sorting " + container.getCapacity() + "kg of plastic and paper.");
    }
}

