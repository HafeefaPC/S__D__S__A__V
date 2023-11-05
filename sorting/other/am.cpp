




string timeConversion(string s) {
  int hour = stoi(s.substr(0, 2));
    int minute = stoi(s.substr(3, 2));
    int second = stoi(s.substr(6, 2));
    string period = s.substr(8, 2);

    if (period == "AM" && hour == 12) {
        hour = 0;
    } else if (period == "PM" && hour != 12) {
        hour += 12;
    }

   // Format the result in 24-hour time
    char buffer[9];
    snprintf(buffer, sizeof(buffer), "%02d:%02d:%02d", hour, minute, second);
    string result(buffer);

    return result
}


