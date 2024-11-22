package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private LengthScale lengthScale;

    /**
     * Sets the length scale for rainfall.
     *
     * @param scale the preferred length scale (INCHES or MILLIMETERS).
     */
    public void setLengthScale(LengthScale scale) {
        this.lengthScale = scale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     *
     * @return the rainfall amount in the preferred scale.
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (lengthScale == LengthScale.INCHES) {
            return wsRainfall * 0.0393701;
        } else {
            return wsRainfall;
        }
    }
}
