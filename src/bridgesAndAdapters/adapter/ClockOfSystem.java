package bridgesAndAdapters.adapter;

import java.time.LocalDate;

public class ClockOfSystem implements IClock {

	@Override
	public LocalDate today() {
		return LocalDate.now();
	}

}
