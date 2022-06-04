package cos.pro.java;


//직원들 급여의 총합을 계산
class Main {
  class Job {
      protected int salary; //직업의 급여

      public Job() {
          this.salary = 0;//초기 급여는 0
      }
      
      public int getSalary() {
          return salary;
      }
  }

  class PartTimeJob extends Job {//Job을 상속 // 아르바이트
      private int workHour, payPerHour;// 아르바이트를 한 시간 , 아르바이트의 시간 당 급여

      public PartTimeJob(int workHour, int payPerHour) {
          this.workHour = workHour;
          this.payPerHour = payPerHour;
      }

      public int getSalary() {//아르바이트 급여를 계산
          salary = workHour * payPerHour;
          if(workHour >= 40)
              salary += (payPerHour * 8);

          return salary;
      }
  }

  class SalesJob extends Job {//Job을 상속 // 판매사원
      private int salesResult, payPerSale; //판매사원의 판매실적 , 판매실적 당 급여

      public SalesJob(int salesResult, int payPerSale) {//판매사원의 급여를 계산하여 return 
          this.salesResult = salesResult;
          this.payPerSale = payPerSale;
      }
      public int getSalary() {
          if(salesResult > 20)//20건이 넘으면 급여를 3배
              salary = salesResult * payPerSale * 3;
          else if(salesResult > 10)//판매실적이 10건이 넘으면 급여를 2배
              salary = salesResult * payPerSale * 2;
          else
              salary = salesResult * payPerSale; //기본적으로 `판매실적 * 판매실적 당 급여

          return salary;
      }
  }

  public int solution(int[][] partTimeJobs, int[][] salesJobs) {// 모든 직원들 급여의 총합을 return //
      int answer = 0;

      for(int i = 0; i < partTimeJobs.length; i++) {
          PartTimeJob partTimeJob = new PartTimeJob(partTimeJobs[i][0], partTimeJobs[i][1]);
          answer += partTimeJob.getSalary();
      }

      for(int i = 0; i < salesJobs.length; i++) {
          SalesJob salesJob = new SalesJob(salesJobs[i][0], salesJobs[i][1]);
          answer += salesJob.getSalary();
      }

      return answer;//모든 직원들 급여의 총합을 return 
  }

