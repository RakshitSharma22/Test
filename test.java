hello
abe yeh toh upload aur copy hi ni hori image

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

1 ->  (2) 
2 -> This registers the imported component that serves as the app's entry point.

3->useNativeDriver: true

4->
5->Any type
6->

7->initialState  

8->RCTRootView  
9->1, 2, and 5  
10->4. A pattern for structurally connecting two incompatible interfaces by wrapping one interface with another  
11->All of these
13->By stringifying the JSON object  



&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

  // 1. Calculate the average temperature for a list of weather data
    public double calculatedAverageTemperature(List<WeatherData> data) {
        return data.stream()
                   .mapToDouble(WeatherData::getTemperature)
                   .average()
                   .orElse(0.0); // return 0.0 if list is empty
    }

    // 2. Calculate the maximum temperature recorded in a list of weather data
    public double calculateMaxTemperature(List<WeatherData> data) {
        return data.stream()
                   .mapToDouble(WeatherData::getTemperature)
                   .max()
                   .orElse(Double.MIN_VALUE); // return minimum possible value if list is empty
    }

    // 3. Calculate the minimum temperature recorded in a list of weather data
    public double calculateMinTemperature(List<WeatherData> data) {
        return data.stream()
                   .mapToDouble(WeatherData::getTemperature)
                   .min()
                   .orElse(Double.MAX_VALUE); // return maximum possible value if list is empty
    }
  
  
  
