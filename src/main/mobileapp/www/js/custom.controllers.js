app.controller('AfterLoginController', function($scope) {
 //
});

app.controller('AfterHomeController', function($scope) {
 //
});

app.controller('AfterPageController', function($scope) {
 //
});

app.controller('CalendarCtrl', function(moment, calendarConfig) {
  
      var vm = this;
  
      //These variables MUST be set as a minimum for the calendar to work
      vm.calendarView = 'month';
      vm.viewDate = new Date();
      console.log(vm.calendarView);
      var actions = [{
        label: '<i class=\'glyphicon glyphicon-pencil\'></i>',
        onClick: function(args) {
          alert.show('Edited', args.calendarEvent);
        }
      }, {
        label: '<i class=\'glyphicon glyphicon-remove\'></i>',
        onClick: function(args) {
          alert.show('Deleted', args.calendarEvent);
        }
      }];
      
     
      // MODEL EVENTS
      vm.events = [
        {
          title: 'Plantao 1',
          medico: 'Carla Silva',
          local: 'HCA - Pediatria',
          color: calendarConfig.colorTypes.warning,
          //startsAt: moment().startOf('week').subtract(2, 'days').add(8, 'hours').toDate(),
          startsAt: new Date(),
          endsAt: new Date(),
          //endsAt: moment().startOf('week').add(1, 'week').add(9, 'hours').toDate(),
          draggable: false,
          resizable: true,
          actions: actions
        },
        {
          title: 'Plantao 2',
          medico: 'João Fernandes',
          local: 'Hospital Porrtuguês - Unidade Móvel',
          color: calendarConfig.colorTypes.warning,
          //startsAt: moment().startOf('week').subtract(2, 'days').add(8, 'hours').toDate(),
          //endsAt: moment().startOf('week').add(1, 'week').add(9, 'hours').toDate(),
          startsAt: new Date(),
          endsAt: new Date(),
          draggable: false,
          resizable: true,
          actions: actions
        },
        {
          title: 'Plantao 3',
          medico: 'Bruna Werneck',
          local: 'HCA - UTI',
          color: calendarConfig.colorTypes.warning,
          //startsAt: moment().startOf('week').subtract(2, 'days').add(8, 'hours').toDate(),
          startsAt: moment().add(1, 'days').toDate(),
          endsAt: moment().add(1, 'days').toDate(),
          //endsAt: moment().startOf('week').add(1, 'week').add(9, 'hours').toDate(),
          draggable: false,
          resizable: true,
          actions: actions
        },
      ];
  
      vm.cellIsOpen = true;
  
      vm.addEvent = function() {
        vm.events.push({
          title: 'New event',
          startsAt: moment().startOf('day').toDate(),
          endsAt: moment().endOf('day').toDate(),
          color: calendarConfig.colorTypes.important,
          draggable: true,
          resizable: true
        });
      };
  
      vm.eventClicked = function(event) {
        vm.currentEvent = event;
        
        let convertDate = {
          inicio: new Date(vm.currentEvent.startsAt),
          final: new Date(vm.currentEvent.endsAt),
        };
        
        vm.currentEvent.convertDates  = {
          inicio: moment(convertDate.inicio).format('DD/MM/YYYY'),
          final: moment(convertDate.final).format('DD/MM/YYYY')
        };
        
        angular.element('#plantaoModal').modal('show');
      };
  
      vm.eventEdited = function(event) {
        alert.show('Edited', event);
      };
  
      vm.eventDeleted = function(event) {
        alert.show('Deleted', event);
      };
  
      vm.eventTimesChanged = function(event) {
        alert.show('Dropped or resized', event);
      };
  
      vm.toggle = function($event, field, event) {
        $event.preventDefault();
        $event.stopPropagation();
        event[field] = !event[field];
      };
  
      vm.timespanClicked = function(date, cell) {
  
        if (vm.calendarView === 'month') {
          if ((vm.cellIsOpen && moment(date).startOf('day').isSame(moment(vm.viewDate).startOf('day'))) || cell.events.length === 0 || !cell.inMonth) {
            vm.cellIsOpen = false;
          } else {
            vm.cellIsOpen = true;
            vm.viewDate = date;
          }
        } else if (vm.calendarView === 'year') {
          if ((vm.cellIsOpen && moment(date).startOf('month').isSame(moment(vm.viewDate).startOf('month'))) || cell.events.length === 0) {
            vm.cellIsOpen = false;
          } else {
            vm.cellIsOpen = true;
            vm.viewDate = date;
          }
        }
  
      };
    });
    
  // app.factory('alert', function($modal) {

  //   function show(action, event) {
  //     return $modal.open({
  //       templateUrl: './modalContent.html',
  //       controller: function() {
  //         var vm = this;
  //         vm.action = action;
  //         vm.event = event;
  //         vm.medico = "Dr. Pablo Mendes"
  //       },
  //       controllerAs: 'vm'
  //     });
  //   }

  //   return {
  //     show: show
  //   };

  // });
   