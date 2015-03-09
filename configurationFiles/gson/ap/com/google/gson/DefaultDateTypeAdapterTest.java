package com.google.gson;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;
import org.junit.Test;
import junit.framework.TestCase;
import java.util.TimeZone;

/** 
 * A simple unit test for the {@link DefaultDateTypeAdapter} class.
 * 
 * @author Joel Leitch
 */
public class DefaultDateTypeAdapterTest extends TestCase {
    @Test(timeout = 1000)
    public void testFormattingInEnUs() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormattingInEnUs");
        assertFormattingAlwaysEmitsUsLocale(Locale.US);
        assertFormattingAlwaysEmitsUsLocale(Locale.US);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormattingInEnUs_remove1240() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormattingInEnUs_remove1240");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormattingInFr() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormattingInFr");
        assertFormattingAlwaysEmitsUsLocale(Locale.FRANCE);
        assertFormattingAlwaysEmitsUsLocale(Locale.FRANCE);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormattingInFr_remove1241() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormattingInFr_remove1241");
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertFormattingAlwaysEmitsUsLocale(Locale locale) {
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(locale);
        try {
            assertFormatted("Jan 1, 1970 12:00:00 AM", new DefaultDateTypeAdapter());
            assertFormatted("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertFormatted("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertFormatted("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertFormatted("1/1/70 12:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertFormatted("Jan 1, 1970 12:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertFormatted("January 1, 1970 12:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertFormatted("Thursday, January 1, 1970 12:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1501() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1501");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1502() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1502");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1503() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1503");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1504() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1504");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1505() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1505");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1506() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1506");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1507() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1507");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1508() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1508");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1509() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1509");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1510() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1510");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1511() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1511");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_add1512() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_add1512");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("foo"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2197() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2197");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("foo", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2198() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2198");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2199() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2199");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2200() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2200");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2201() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2201");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2202() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2202");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2203() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2203");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithSystemLocale_literalMutation2204() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_literalMutation2204");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_remove1242() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_remove1242");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.FRANCE);
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithSystemLocale_remove1243() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithSystemLocale_remove1243");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        try {
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter());
            assertParsed("01/01/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1 janv. 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("1 janvier 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("01/01/70 00:00", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1 janv. 1970 00:00:00", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("1 janvier 1970 00:00:00 UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("jeudi 1 janvier 1970 00 h 00 UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1513() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1513");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1514() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1514");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1515() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1515");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1516() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1516");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1517() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1517");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1518() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1518");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1519() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1519");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1520() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1520");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1521() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1521");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1522() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1522");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1523() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1523");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_add1524() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_add1524");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("foo"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2206() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2206");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("foo", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2207() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2207");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2208() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2208");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2209() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2209");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2210() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2210");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2211() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2211");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2212() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2212");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testParsingDatesFormattedWithUsLocale_literalMutation2213() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_literalMutation2213");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("foo", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_remove1244() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_remove1244");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testParsingDatesFormattedWithUsLocale_remove1245() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testParsingDatesFormattedWithUsLocale_remove1245");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Locale defaultLocale = Locale.getDefault();
        try {
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter());
            assertParsed("1/1/70", new DefaultDateTypeAdapter(DateFormat.SHORT));
            assertParsed("Jan 1, 1970", new DefaultDateTypeAdapter(DateFormat.MEDIUM));
            assertParsed("January 1, 1970", new DefaultDateTypeAdapter(DateFormat.LONG));
            assertParsed("1/1/70 0:00 AM", new DefaultDateTypeAdapter(DateFormat.SHORT , DateFormat.SHORT));
            assertParsed("Jan 1, 1970 0:00:00 AM", new DefaultDateTypeAdapter(DateFormat.MEDIUM , DateFormat.MEDIUM));
            assertParsed("January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.LONG , DateFormat.LONG));
            assertParsed("Thursday, January 1, 1970 0:00:00 AM UTC", new DefaultDateTypeAdapter(DateFormat.FULL , DateFormat.FULL));
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_add1493() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_add1493");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_add1494() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_add1494");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_add1495() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_add1495");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_add1496() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_add1496");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_add1497() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_add1497");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_add1498() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_add1498");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFormatUsesDefaultTimezone() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("foo"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFormatUsesDefaultTimezone_literalMutation2193() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_literalMutation2193");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("foo", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testFormatUsesDefaultTimezone_literalMutation2194() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_literalMutation2194");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("foo", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_remove1238() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_remove1238");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.US);
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    @Test(timeout = 1000)
    public void testFormatUsesDefaultTimezone_remove1239() {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testFormatUsesDefaultTimezone_remove1239");
        TimeZone defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("America/Los_Angeles"));
        Locale defaultLocale = Locale.getDefault();
        try {
            assertFormatted("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
            assertParsed("Dec 31, 1969 4:00:00 PM", new DefaultDateTypeAdapter());
        } finally {
            TimeZone.setDefault(defaultTimeZone);
            Locale.setDefault(defaultLocale);
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDateSerialization() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDateSerialization");
        int dateStyle = DateFormat.LONG;
        DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(dateStyle);
        DateFormat formatter = DateFormat.getDateInstance(dateStyle, Locale.US);
        Date currentDate = new Date();
        String dateString = dateTypeAdapter.serialize(currentDate, Date.class, null).getAsString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2665,formatter,2664,formatter.format(currentDate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2666,dateString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testDatePattern() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testDatePattern");
        String pattern = "foo";
        DefaultDateTypeAdapter dateTypeAdapter = new DefaultDateTypeAdapter(pattern);
        DateFormat formatter = new SimpleDateFormat(pattern);
        Date currentDate = new Date();
        String dateString = dateTypeAdapter.serialize(currentDate, Date.class, null).getAsString();
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2662,formatter,2661,formatter.format(currentDate));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2663,dateString);
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    public void testInvalidDatePattern() throws Exception {
        fr.inria.diversify.testamplification.logger.Logger.writeTestStart(Thread.currentThread(),this, "testInvalidDatePattern");
        try {
            new DefaultDateTypeAdapter("foo");
        } catch (IllegalArgumentException expected) {
        }
        fr.inria.diversify.testamplification.logger.Logger.writeTestFinish(Thread.currentThread());
    }

    private void assertFormatted(String formatted, DefaultDateTypeAdapter adapter) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2651,formatted);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2653,adapter.serialize(new java.util.Date(0), java.util.Date.class, null),2652,adapter.serialize(new java.util.Date(0), java.util.Date.class, null).getAsString());
    }

    private void assertParsed(String date, DefaultDateTypeAdapter adapter) {
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2654,date);
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2655,new java.util.Date(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2657,adapter,2656,adapter.deserialize(new com.google.gson.JsonPrimitive(date), java.util.Date.class, null));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2658,new java.util.Date(0));
        fr.inria.diversify.testamplification.logger.Logger.logAssertArgument(Thread.currentThread(),2660,adapter,2659,adapter.deserialize(new com.google.gson.JsonPrimitive("1970-01-01T00:00:00Z"), java.util.Date.class, null));
    }
}

