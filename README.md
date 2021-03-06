## Amber Davidson - Coffee Calculator App
 This is a coffee calculator app that helps take the guesswork out of how much coffee and water you need in order to create a great cup of coffee. Users are able to choose between four different methods as well as choose how many cups of coffee they want.

## Contents
- [Case Study Rubric (contact Sang Shin to access this document)](https://docs.google.com/document/d/176gq1qsX1azl7ckhc3Cu7_LK6oqWOcU28cd-q3jbZQI/edit)
- [Daily Progress](#daily-progress)
- [User Stories](#user-stories)
- [Technical Architecture](#technical-architecture)
- [Technical Challenges](#technical-challenges)
- [Lessons Learned](#lessons-learned)
- [Future Improvements](#future-improvements)
- [Wire Frames](#wire-frames)
- [Schema Diagram](#schema-diagram)

## Daily Progress
- April 26th (100% done)
  - Updated internal CSS to external sheets
  - Worked on logging and testing
- April 25th (90% done)
  - Updated Thymeleaf for displaying cups
  - Updated Java code for coffee/water calculation
  - Started testing
  - Inserted images into README
- April 22nd (70% done)
  - Worked on truncating coffee amount decimals
  - Updated CSS for registration page
  - Completed practice presentation
  - Updated Capstone Rubric Google Doc
- April 21st (80% done)
  - Completed ThymeLeaf mapping for "save brew" function
  - Implemented CRUD operations for brew results (update, delete)
- April 20th (75% done)
  - Completed Spring Security for login & registration
  - Completed ThymeLeaf to link form and brew results
  - Started logic for coffee/water calculations
- April 19th (60% done)
  - Started Spring Security
  - Started adding ThymeLeaf to form and brew results pages
- April 18th (50% done)
  - Finished modifying database tables/models
  - Finished controllers
  - Added 404 html file
- April 15th (45% done)
  - Continued work on entity models
- April 14th (45% done)
  - Reworked database tables
  - Updated entity models
  - CSS updates
- April 13th (40% done)
  - Updating CSS pages
  - Created two new models
  - CRUD operations fully functioning
- April 11th (30% done)
  - Worked on mapping within controller for CRUD operations

### User Stories:
- As a user, I want to create an account with a username and password so that my info and preferences will be saved in the app.
  - Task: Implement login functionality
  - Task: Decide on information and preferences to be collected for account
  - Task: Enable preferences to be collected/saved

- As a user, I want the ability to view my account details.
  - Task: Decide how the user will navigate to account details
  - Task: Decide what the user will see in account details
  
- As a user, I want the ability to update my account details so my info and preferences will be current and up-to-date.

- As a user, I want to be able to cancel my account so that my info is no longer stored.

- As a user, I want to input my desired method of making coffee so that I can receive detailed instructions from the app.
  - Task: Define methods of making coffee that can be chosen by user
  - Task: Decide how method will be selected
  - Task: Enable user to choose 1 method 
  - Task: Create connections to grind size and other classes
  
- As a user, I want to be able to choose unit of measure so that I can measure ingredients the way I want to.
  - Task: Define which units of measure can be chosen
  - Task: Decide how unit of measure will be selected

## Technical Architecture
![Technical Architecture](https://github.com/davidamber/capstone-project/blob/main/src/main/resources/static/images/techarchitecture.png)
## Technical Challenges
- A technical challenge I faced was using ThymeLeaf, particularly when it came to displaying results within a table in the final step of the process. An example of this was needing to use a different notation in order to pull information from a variable that was in a different entity model than the others. I also needed to use hidden inputs in order to correctly pull information.
- I also struggled often with centering images and other objects using CSS, as well as properly displaying images in general. I googled and used others' code snippets when I was unsure and used a process of trial and error until I found something that worked. Another workaround that I needed to implement for my login background was using the direct URL for the image rather than the one I had stored locally.
## Lessons Learned
- More than just learning how to code, I've learned to become more resilient. As someone who didn't have a background in coding, this program was quite intense and there were times that I wasn't sure if I would be able to learn all that I needed to. However, I persevered, stuck it out, and learned how to be transparent about areas that I needed help with.
- Another important lesson I've learned along the way is that coding is a non-linear, highly iterative process. I had thought that I could start from the database and then move on to the backend and frontend once I was finished, but I've needed to remain flexible and go back and forth between the different components of my tech stack.
- I've also learned how important it is to rely on your teammates to help you succeed. I experienced a highly collaborative environment in this cohort, and I can honestly say that I wouldn't have been able to build this app without their help and support.
## Future Improvements
- Some features I would like to include in the future: 
   - Ability to choose desired strength of coffee
   - Different units of measure (tablespoons, ounces, etc.)
   - Include grind size
   - Video tutorial on the results page would change depending on coffee method chosen
   - More detailed instructions on how to make coffee with specified method
   - Admin role functionality for user list
## Wire Frames
![Wire Frames](https://github.com/davidamber/capstone-project/blob/main/Davidson_Amber_Wireframe.png)
## Schema Diagram
![Schema Diagram](https://github.com/davidamber/capstone-project/blob/main/Davidson_Amber_Schema.png)
