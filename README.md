- - -
## Brief Introduction
| Function           | This framework                                                                                                     |
|--------------------|--------------------------------------------------------------------------------------------------------------------|
| Front-end          | Use Vue3 + TS + ElementPlus overwrite                                                                              |
| Back-end           | Adopt the form of pluginization and extension packages, decouple the structure, and make it easy to expand.        |
| Database           |  MySQL、Oracle、PostgreSQL、SQLServer                                                                                           |
| Web container      | Adopt Undertow, a high - performance container based on XNIO.                                                      |
| authorization      | Adopt Sa-Token and JWT. Their static usage features comprehensive functions, low coupling, and high extensibility. |
| SQL monitoring     | Adopt P6Spy, which can output complete SQL statements and monitor execution time.                                  |
| WebSocket Protocol | Based on the WebSocket protocol encapsulated by Spring, it extends Token authentication and distributed session synchronization.|
| Cloud storage      | Use AWS S3 protocol client Support all manufacturers that support the S3 protocol.|
| Mail               | Use mail-api|
| Workflow support   | It supports various functions such as complex approvals, forwarding of tasks, delegation, adding and removing signatories, joint signing, alternative signing, ticket signing, etc. |
| Distributed lock   | Adopt Lock4j, which is based on Redisson at the underlying level.|

## Built-in functions

User Management: Users are the system operators, and this function mainly accomplishes the configuration of system users.

Department management: Configure the system's organizational structure (company, department, team), and display the supported data permissions in a tree structure.

Position management: Configure the positions held by system users.

Menu management: Configure system menus, operation permissions, button permission identifiers, etc.

Role management: Role menu permission allocation, setting roles to divide data scope permissions by institution.

Dictionary management: Maintaining some relatively fixed data frequently used in the system.

Parameter management: Dynamically configure common parameters for the system.

Notice and Announcement: Maintenance of system notice and announcement information release.

Operation log: Recording and querying of normal system operation logs; Log recording and query of system abnormal information.

Login log: The system login log record query includes login exceptions.

Online users: Monitoring the status of active users in the current system.

Scheduled tasks: Online (add, modify, delete) task scheduling includes execution result logs.

Code generation: Front-end and back-end code generation (java, html, xml, sql) supports CRUD download.

System interface: Automatically generate relevant api interface documentation based on business code.

Service monitoring: Monitor the current system's CPU, memory, disk, stack and other related information.

Cache monitoring: Querying cache information of the system, command statistics, etc.

Online builder: Drag form elements to generate the corresponding HTML code.

Connection pool monitoring: Monitor the current status of the system database connection pool and conduct SQL analysis to identify system performance bottlenecks.

## Demonstration legend

|                                                                                            |                                                                                            |
|--------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
![demo1.png](img%2Fdemo1.png)

![demo2.png](img%2Fdemo2.png)

![demo3.png](img%2Fdemo3.png)






