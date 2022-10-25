import java.util.ArrayList;

public class Business {
    private String name;

    private ArrayList<BusinessAsset> assets = new ArrayList<BusinessAsset>();

    public Business(String newName){
        name = newName;
    }

    public void addAsset(BusinessAsset asset){
        assets.add(asset);
    }

    public void removeAsset(BusinessAsset asset){
        assets.remove(asset);
    }

    public String getName() {
        return name;
    }

    public String showAssets(){
        String assetNames = "";
        for (BusinessAsset i: assets){
            assetNames += "\n" + i.getName();
        }
        return assetNames;
    }
}
