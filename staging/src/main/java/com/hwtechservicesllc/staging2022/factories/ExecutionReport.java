package com.hwtechservicesllc.staging2022.factories;

import com.hwtechservicesllc.staging2022.enums.Tag35MsgType;
import com.hwtechservicesllc.staging2022.fields.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ExecutionReport {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final Tag35MsgType tag35MsgType;
    private final CompanyName companyName;
    private final TickerSymbol tickerSymbol;
    private final OpeningPrice openingPrice;
    private final PreviousDaysClosingPrice previousDaysClosingPrice;
    private final LastTradePrice lastTradePrice;
    private final LastTradeQuantity lastTradeQuantity;
    private final LastTradeDateStamp lastTradeDateStamp;
    private final LastTradeTimeStamp lastTradeTimeStamp;

    //
    private ExecutionReport(ExecutionReport.Builder builder) {
        this.tag35MsgType = builder.tag35MsgType;
        this.companyName = builder.companyName;
        this.tickerSymbol = builder.tickerSymbol;
        this.openingPrice = builder.openingPrice;
        this.previousDaysClosingPrice = builder.previousDaysClosingPrice;
        this.lastTradePrice = builder.lastTradePrice;
        this.lastTradeQuantity = builder.lastTradeQuantity;
        this.lastTradeDateStamp = builder.lastTradeDateStamp;
        this.lastTradeTimeStamp = builder.lastTradeTimeStamp;
    }

    public Tag35MsgType getMsgType() {
        return tag35MsgType;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public TickerSymbol getTickerSymbol() {
        return tickerSymbol;
    }

    public OpeningPrice getOpeningPrice() {
        return openingPrice;
    }

    public PreviousDaysClosingPrice getPreviousDaysClosingPrice() {
        return previousDaysClosingPrice;
    }

    public LastTradePrice getLastTradePrice() {
        return lastTradePrice;
    }

    public LastTradeQuantity getLastTradeQuantity() {
        return lastTradeQuantity;
    }

    public LastTradeDateStamp getLastTradeDateStamp() {
        return lastTradeDateStamp;
    }

    public LastTradeTimeStamp getLastTradeTimeStamp() {
        return lastTradeTimeStamp;
    }


    // If any EnemyShip object is printed to screen this shows up
    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder.append(tag35MsgType.getTag35MsgTypeValue());
        stringBuilder.append("\n");
        stringBuilder.append(companyName.getCompanyName());
        stringBuilder.append("\n");
        stringBuilder.append(tickerSymbol.getTickerSymbol());
        stringBuilder.append("\n");
        stringBuilder.append(openingPrice.getPrice());
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice.getPrice());
        stringBuilder.append("\n");
        stringBuilder.append(lastTradePrice.getPrice());
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeQuantity.getQuantity());
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeDateStamp.getDateStamp());
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeTimeStamp.getTimeStamp());

        return stringBuilder.toString();
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class
    public static class Builder {

        private final String DEBUG_TAG = this.getClass().getSimpleName();
        private final Logger logger = LogManager.getLogger(DEBUG_TAG);

        private StringBuilder stringBuilder = new StringBuilder();

        private Tag35MsgType tag35MsgType;
        private CompanyName companyName;                // 1
        private TickerSymbol tickerSymbol;              // 2
        private OpeningPrice openingPrice;              // 3
        private PreviousDaysClosingPrice previousDaysClosingPrice;    // 4
        private LastTradePrice lastTradePrice;          // 5
        private LastTradeQuantity lastTradeQuantity;    // 6
        private LastTradeDateStamp lastTradeDateStamp;  // 7
        private LastTradeTimeStamp lastTradeTimeStamp;  // 8

        // helper class to build object
        public Builder(Tag35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
            return;
        }

        public Builder buildCompanyName(String companyName) {
            this.companyName = new CompanyName(companyName);
            return this;
        }

        public Builder buildTickerSymbol(String tickerSymbol) {
            this.tickerSymbol = new TickerSymbol(tickerSymbol);
            return this;
        }

        public Builder buildOpeningPrice(double openingPrice) {
            this.openingPrice = new OpeningPrice(openingPrice);
            return this;
        }

        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
            this.previousDaysClosingPrice = new PreviousDaysClosingPrice(previousDaysClosingPrice);
            return this;
        }

        public Builder buildLastTradePrice(double lastTradePrice) {
            this.lastTradePrice = new LastTradePrice(lastTradePrice);
            return this;
        }

        public Builder buildLastTradeQuantity(double lastTradeQuantity) {
            this.lastTradeQuantity = new LastTradeQuantity(lastTradeQuantity);
            return this;
        }

        public Builder buildLastTradeDateStamp(String lastTradeDateStamp) {
            this.lastTradeDateStamp = new LastTradeDateStamp(lastTradeDateStamp);
            return this;
        }

        public Builder buildLastTradeTimeStamp(String lastTradeTimeStamp) {
            this.lastTradeTimeStamp = new LastTradeTimeStamp(lastTradeTimeStamp);
            return this;
        }
        public ExecutionReport build() {
            return new ExecutionReport(this);
        }
    }

}
