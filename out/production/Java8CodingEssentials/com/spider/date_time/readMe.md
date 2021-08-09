### Useful formatting patterns
   * PATTERN	EXAMPLE
   1. yyyy-MM-dd (ISO) &nbsp;	“2018-07-14”
   2. dd-MMM-yyyy &nbsp;	“14-Jul-2018”
   3. dd/MM/yyyy &nbsp;	“14/07/2018”
   4. E, MMM dd yyyy &nbsp;	“Sat, Jul 14 2018”
   5. h:mm a &nbsp;	“12:08 PM”
   6. EEEE, MMM dd, yyyy HH:mm:ss a	“Saturday, Jul 14, 2018 14:31:06 PM”
   7. yyyy-MM-dd'T'HH:mm:ssZ &nbsp;	“2018-07-14T14:31:30+0530”
   8. hh 'o''clock' a, zzzz	 &nbsp; “12 o’clock PM, Pacific Daylight Time”
   9. K:mm a, z &nbsp;	“0:08 PM, PDT”

### Parsing string to Dates 

1. Phase 1 is a basic text parse according to the fields added to the builder. It simply checks that individual fields in date string (e.g. day, month, year etc) make sense.
2. Phase 2 resolves the parsed field-value pairs into date and/or time objects. Here Java tries to create actual date time objects with supplied information in date string.

Home / Java 8 / Java 8 ResolverStyle.STRICT
Java 8 ResolverStyle.STRICT
Last Modified: August 3, 2019

Learn to parse date and time strings into instances of LocalDate and LocalDateTime using strict style using ResolverStyle.STRICT parameter with DateTimeFormatter instance.

ResolverStyle – Parsing styles
   Parsing string to dates in Java happen in two phases.

* ResolverStyle is an enum and used to control how phase 2, resolving, happens. It contains three styles of parsing:

LENIENT – Style to resolve dates and times leniently.
Lenient parsing example
2019-02-27  - is parsed to  - 2019-02-27
2019-02-28  - is parsed to  - 2019-02-28
2019-02-29  - is parsed to  - 2019-03-01    //Date moved to next month

SMART – Style to resolve dates and times in a smart, or intelligent, manner.
Smart parsing example
2019-02-27  - is parsed to  - 2019-02-27
2019-02-28  - is parsed to  - 2019-02-28
2019-02-29  - is parsed to  - 2019-02-28    //Date adjusted based on smart guessing

STRICT – Style to resolve dates and times strictly.
Strict parsing example
2019-02-27  - is parsed to  - 2019-02-27
2019-02-28  - is parsed to  - 2019-02-28
2019-02-29  - is parsed to  - //java.time.format.DateTimeParseException