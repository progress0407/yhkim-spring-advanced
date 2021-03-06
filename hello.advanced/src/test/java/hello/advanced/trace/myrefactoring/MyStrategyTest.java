package hello.advanced.trace.myrefactoring;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyStrategyTest {

	@Test
	public void templateMethodV0() {
		logic1();
		logic2();
	}

	private void logic1() {
		long startTime = System.currentTimeMillis();
		// 비즈니스 로직 실행
		log.info("비즈니스 로직1 실행");
		// 비즈니스 로직 종료
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		log.info("resultTime={}", resultTime);
	}

	private void logic2() {
		long startTime = System.currentTimeMillis();
		// 비즈니스 로직 실행
		log.info("비즈니스 로직2 실행");
		// 비즈니스 로직 종료
		long endTime = System.currentTimeMillis();
		long resultTime = endTime - startTime;
		log.info("resultTime={}", resultTime);
	}

	interface LogicStrategy {
		void execute();
	}

	private static class LogicStrategyImpl implements LogicStrategy {

		@Override
		public void execute() {
			long startTime = System.currentTimeMillis();
			// 비즈니스 로직 실행
			log.info("비즈니스 로직2 실행");
			// 비즈니스 로직 종료
			long endTime = System.currentTimeMillis();
			long resultTime = endTime - startTime;
			log.info("resultTime={}", resultTime);

		}
	}

}
