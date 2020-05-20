import java.time.LocalDateTime;

public class MeteoStoreAdaprer implements MeteoSensor{
	SensorTemperature sensor;
	
	MeteoStoreAdaprer(SensorTemperature sensor){
		this.sensor=sensor;
	}
	
	@Override
	public int getID(){
		return sensor.identifier()+1;
	}
	
	@Override
    public Float getTemperature() {
        return (float)sensor.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(sensor.year(), 1, 1, 0, 0, 0).plusDays(sensor.day()-1).plusSeconds(sensor.second());
    }
}