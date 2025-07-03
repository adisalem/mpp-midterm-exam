# Online hotel reservation system
## 1. User story for each user
### Guest user stories
As a Guest, I want to search for available rooms so that I can make an online reservation.
As a Guest, I want to book rooms so that I will have a room to stay at during my vacation.
As a Guest, I want to Cancel my booking so that I will remove my reservation and make it free for others.
### Receptionist user stories
As a Receptionist, I want to add booking so that I can reserve rooms for Guests.
As a Receptionist, I want to update booking so that I can make changes to reservations.
As a Rerectionist, I wnat to cancel booking so that I can remove reservations and make it free for others.
### Manager user stories
As a Manager, I want to add receptionsit so that to Assign the role of add new booking to the receptionist.
As a Manager, I want to generate revenue reports so that I can report revenue report to higher officials.
As a Manager, I want to generate remove receptionist so that free our system from non existing users.
## 2. Usecase description fro each
### for guest user
        SEARCH_ROOM use case description: Main flow
        Guest action                                           system response
        1. search available rooms                                  system displays available rooms
        2. book desired room                                       system gives booking confirmation
### for Receptionist
       CANCEL_BOOKING usecase description: Main flow
       Receptionist action                                           system response
       1. Visit booking page                                           system provides list of bookings
       2. select booking to cancel                                     system highlights selected booking
       3. cancel selected booking                                      system provides cancelation of booking

### for Manager 
        REMOVE_RECEPTIONIST usecase description: main flow
        Manager action                                           system response
        1. visit users page                                       retuns list of  users with filter option on role
        2. filter users by receptinist                            returns list of receptionists
        3. search receptionist you want to remove                 system returns the receptionist to be removed
        4. click on delete                                        system provides an option to continue
        5. confirm deletion                                       system reply with successful deletion

## 3. Draw usecase diagram
 refer to hotel reservation image
