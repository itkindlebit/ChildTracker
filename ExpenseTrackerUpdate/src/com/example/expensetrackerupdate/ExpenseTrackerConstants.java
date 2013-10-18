package com.example.expensetrackerupdate;

public class ExpenseTrackerConstants
{
  public static String addExpense;
  public static String addMedical;
  public static String addReminder;
  public static String addResidential;
  public static String address;
  public static String calendar;
  public static String capturedPictureDate;
  public static String dateOfBirth;
  public static String deleteExpense;
  public static String deleteMedical;
  public static String deleteReminder;
  public static String deleteResidential;
  public static String dropOffDate;
  public static String dropOffLocation;
  public static String dropOffTime;
  public static String email;
  public static String forgetPasswordUrl;
  public static String getExpense;
  public static String getExpenseReportData;
  public static String getFile;
  public static String getMedical;
  public static String getReminder;
  public static String getResidential;
  public static String getResidentialReportData;
  public static String getStates;
  public static String getStatesServices;
  public static String id;
  public static String isSubscribed;
  public static String listType;
  public static String logOutUrl;
  public static String loginUrl;
  public static String notes;
  public static String password;
  public static String personName;
  public static String phone;
  public static String pickUpDate;
  public static String pickUpLocation;
  public static String pickUpTime;
  public static String pinCode;
  public static String reminderDate;
  public static String reminderId;
  public static String reminderMonth;
  public static String reminderTime;
  public static String reminderType;
  public static String reminderYear;
  public static String signUpUrl;
  public static String stateId;
  public static String updateExpense;
  public static String updateMedical;
  public static String updateProfile;
  public static String updateReminder;
  public static String updateResidential;
  public static String userId;
  public static String userName;
  public static String webServiceUrl = "http://10.0.1.11/dadmom/webservices/";

  static
  {
    loginUrl = webServiceUrl + "login_user.php?";
    signUpUrl = webServiceUrl + "register_user.php?";
    logOutUrl = webServiceUrl + "logout_user.php?";
    forgetPasswordUrl = webServiceUrl + "reset_password.php?";
    updateProfile = webServiceUrl + "update_user.php?";
    getResidential = webServiceUrl + "get_residentials.php?";
    addResidential = webServiceUrl + "add_residential.php?";
    updateResidential = webServiceUrl + "update_residential.php?";
    deleteResidential = webServiceUrl + "delete_residential.php?";
    getExpense = webServiceUrl + "get_expenses.php?";
    deleteExpense = webServiceUrl + "delete_expense.php?";
    addExpense = webServiceUrl + "add_expense.php?";
    getFile = webServiceUrl + "get_file.php?params=";
    updateExpense = webServiceUrl + "update_expense.php?";
    getMedical = webServiceUrl + "get_medical_notes.php?";
    addMedical = webServiceUrl + "add_medical_note.php?";
    updateMedical = webServiceUrl + "update_medical_note.php?";
    deleteMedical = webServiceUrl + "delete_medical_note.php?";
    getExpenseReportData = webServiceUrl + "get_expense_report_data.php?";
    getResidentialReportData = webServiceUrl + "get_residential_report_data.php?";
    addReminder = webServiceUrl + "add_reminder.php?";
    getReminder = webServiceUrl + "get_reminders.php?";
    updateReminder = webServiceUrl + "update_reminder.php?";
    deleteReminder = webServiceUrl + "delete_reminder.php?";
    getStates = webServiceUrl + "get_states.php";
    getStatesServices = webServiceUrl + "get_state_services.php?";
    personName = "person_name";
    userName = "user_name";
    password = "password";
    pinCode = "pin_code";
    email = "email";
    phone = "phone";
    address = "address";
    dateOfBirth = "dob";
    userId = "user_id";
    pickUpLocation = "pick_up_location";
    pickUpTime = "pick_up_time";
    pickUpDate = "pick_up_date";
    dropOffDate = "drop_off_date";
    dropOffTime = "drop_off_time";
    dropOffLocation = "drop_off_location";
    notes = "notes";
    calendar = "calendar";
    listType = "list_type";
    id = "id";
    reminderType = "reminder_type";
    reminderDate = "reminder_date";
    reminderTime = "reminder_time";
    reminderMonth = "reminder_month";
    reminderYear = "reminder_year";
    capturedPictureDate = "picture_captured_date";
    reminderId = "id";
    stateId = "state_id";
    isSubscribed = "is_subscribed";
  }
}

/* Location:           C:\Users\axcv\Desktop\New folder (3)\classes_dex2jar.jar
 * Qualified Name:     com.dadmom.expensetracker.utils.ExpenseTrackerConstants
 * JD-Core Version:    0.6.0
 */