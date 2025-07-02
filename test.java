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

   //4 .

public String findLocationWithHighestHumidity(List<WeatherData> data) {
    return data.stream()
               .max((d1, d2) -> Double.compare(d1.getHumidity(), d2.getHumidity()))
               .map(WeatherData::getLocation)
               .orElse(""); // return empty string if list is empty
}

//5.
public double calculateAverageWindspeed(List<WeatherData> data) {
    return data.stream()
               .mapToDouble(WeatherData::getWindspeed)
               .average()
               .orElse(0.0); // return 0.0 if list is empty
}




// 7. Find the most common weather condition
public String findMostCommonWeatherCondition(List<WeatherData> data) {
    return data.stream()
            .collect(Collectors.groupingBy(
                    WeatherData::getWeatherCondition,
                    Collectors.counting()
            ))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("");
}

// 8. Calculate the difference between the highest and lowest temperatures
public double calculateTemperatureRange(List<WeatherData> data) {
    OptionalDouble maxTemp = data.stream().mapToDouble(WeatherData::getTemperature).max();
    OptionalDouble minTemp = data.stream().mapToDouble(WeatherData::getTemperature).min();

    if (maxTemp.isPresent() && minTemp.isPresent()) {
        return maxTemp.getAsDouble() - minTemp.getAsDouble();
    }
    return 0.0;
}





// 10. Count how many times a specific weather condition appears
public int countWeatherConditionOccurrences(List<WeatherData> data, String condition) {
    return (int) data.stream()
                     .filter(w -> w.getWeatherCondition().equalsIgnoreCase(condition))
                     .count();
}

// 11. Check if any location has extreme temperatures (below -10 or above 40)
public boolean hasExtremeTemperatures(List<WeatherData> data) {
    return data.stream()
               .anyMatch(w -> w.getTemperature() < -10 || w.getTemperature() > 40);
}

//12
public String findLocationWithHighestAverageTemperature(List<WeatherData> data) {
    return data.stream()
            .collect(Collectors.groupingBy(
                    WeatherData::getLocation,
                    Collectors.averagingDouble(WeatherData::getTemperature)
            ))
            .entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("");
}

  

//9
public List<String> findLocationsWithWindspeedRange(List<WeatherData> data, double minspeed, double maxspeed) {
    return data.stream()
               .filter(w -> w.getWindspeed() >= minspeed && w.getWindspeed() <= maxspeed)
               .map(WeatherData::getLocation)
               .distinct() // optional: to avoid duplicates if a location appears multiple times
               .collect(Collectors.toList());
}


//6
public List<String> findLocationsAboveTemperature(List<WeatherData> data, double threshold) {
    return data.stream()
               .filter(w -> w.getTemperature() > threshold)
               .map(WeatherData::getLocation)
               .distinct() // Optional: to avoid duplicates
               .collect(Collectors.toList());
}

  

  
  
  
