package customize.markerinterface.exam;

public class TestMarkerInterface {

	static void isMarker(Object obj)
	{
		if (obj instanceof CustomizeMarkerInterface)
		{
			System.out.println("It's the object of my own created customize interface");
		}
	}
	
	public static void main(String[] args) {
		ImplCustomizeMarkerInterface implCustMrkInf = new ImplCustomizeMarkerInterface();
		isMarker(implCustMrkInf);

	}

}
