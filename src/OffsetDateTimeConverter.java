import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimeConverter {
	public static void main(String[] args) {
		String currentOffsetDateTime = String.valueOf(OffsetDateTime.now());
		OffsetDateTime curDateTime = OffsetDateTime.now();
		System.out.println("Current OffsetDateTime: " + currentOffsetDateTime);
		String wacTimeStamp = curDateTime.format(DateTimeFormatter.ofPattern(" 	"));
		System.out.println(wacTimeStamp);
	}
}