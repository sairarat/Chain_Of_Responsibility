public abstract class WasteCollector {
    private WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector){
        this.nextCollector = nextCollector;
    }

    public void processWaste(WasteContainer wasteContainer){
        if(canHandle(wasteContainer)){
            collect(wasteContainer);
        }else if(nextCollector != null){
            nextCollector.processWaste(wasteContainer);
        }else{
            System.out.println("Cannot process " + wasteContainer + " no collector found");
        }
    }

    public abstract boolean canHandle(WasteContainer wasteContainer);
    public abstract void collect(WasteContainer wasteContainer);
}
