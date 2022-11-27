import axios from 'axios';

// API specific settings 
// const API_LOCATION_URL    = 'https://api.openweathermap.org/data/2.5/weather';
const API_CURRENT_URL = 'https://api.openweathermap.org/data/2.5/forecast';
const API_KEY = 'PLACE YOUR OWN OPEN WEATHER API';
//"lon": 106.8451, "lat": -6.2146//hasil lokasi jakarta LOCATION_API_URL
const LAT = -6.2146;
const LON = 106.8451;
//const LOCATION_API_URL   = `${API_CURRENT_URL}?q=${LOCATION_CODE}&units=${UNITS}&appid=${API_KEY}`;
const WEATHER_API_URL = `${API_CURRENT_URL}?lat=${LAT}&lon=${LON}&appid=${API_KEY}`;

axios.get(WEATHER_API_URL, { responseType: "json", }).then(response => {
  console.log("Weather Forecast:");
  response.data.list.forEach((list) => {

    const time = list.dt_txt.split(" ");
    // Handle Temperature conversions from Kelvins
    if (time[1] == "12:00:00") {
      
      const temperatureK = list.main.temp;
      const date = time[0];
      const dates = date.split("-");
      const temperatureC = temperatureK - 273.15;
      const tempC = temperatureC.toString().substring(0,5) + "°C"

      let month = ['Jan', 'Feb', 'Mar', 'Apr', 'Mei', 'Jun', 'Jul', 'Agu', 'Sep', 'Okt', 'Nov', 'Des'];
      function getDayNameFromDate(date) {
        let cek_date = new Date(date);
          let days = ['Sun', 'Mon', 'Thu', 'Wed', 'Tue', 'Fri', 'Sat'];
          let cek_day = cek_date.getDay(),
              day = days[cek_day];
          return day;
      }
      let data={
        day_name: getDayNameFromDate(date),
        day: dates[2],
        month: month[dates[1]],
        year: dates[0],
        temp: tempC,
      }

      console.log(data.day_name+", "+data.day+" "+data.month+" "+data.year+": "+data.temp)

    }
  });
});
