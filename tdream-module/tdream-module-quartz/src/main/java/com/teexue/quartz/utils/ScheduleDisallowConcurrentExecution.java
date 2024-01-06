package com.teexue.quartz.utils;

import org.quartz.DisallowConcurrentExecution;

/**
 * 禁止并发
 *
 * @author teexue admin@teexue.com
 *
 *
 */
@DisallowConcurrentExecution
public class ScheduleDisallowConcurrentExecution extends AbstractScheduleJob {

}
