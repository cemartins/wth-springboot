# demo


**1 clone the project** 

`git clone git@gitlab.com:focus_it/payroll.git`

**2. Run the app** 

`run class "PayrollApplication"` 

**3. check database H2**

`http://localhost:8080/h2` 

**4. Rest resources**

| Description                       | Rest    | URL                                                              |
| :-------------------------------: | :-----: | :--------------------------------------------------------------: |
| Get all customers                 | GET     | http://localhost:8080/customer                                   |
| Get one customer                  | GET     | http://localhost:8080/customer/{customerId}                      |
| Update customer                   | PUT     | http://localhost:8080/customer                                   |
| Create customer                   | POST    | http://localhost:8080/customer                                   |
| Delete customer                   | DELETE  | http://localhost:8080/customer/{customerId}                      |
