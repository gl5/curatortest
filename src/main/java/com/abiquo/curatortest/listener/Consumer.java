package com.abiquo.curatortest.listener;

import org.apache.log4j.Logger;

/** Prototype consumer. */
public class Consumer
{
    protected static final Logger LOGGER = Logger.getLogger(Consumer.class);

    /** Start consuming messages in other Thread, do not block, return immediately. */
    public void start()
    {
        LOGGER.info("*****************");
        LOGGER.info("Consumer started");
        LOGGER.info("*****************");
    }

    /** Stop consuming messages. */
    public void stop()
    {
        LOGGER.info("*****************");
        LOGGER.info("Consumer stopped");
        LOGGER.info("*****************");
    }
}
