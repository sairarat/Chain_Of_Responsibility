public class HazardousCollector extends WasteCollector {
    @Override
    public boolean canHandle(WasteContainer container) {
        return container.getType().equalsIgnoreCase("hazardous");
    }

    @Override
    public void collect(WasteContainer container) {
        System.out.println("Waste Type: Hazardous....Securely disposing of " + container.getCapacity() + "kg of toxic materials.");
    }
}