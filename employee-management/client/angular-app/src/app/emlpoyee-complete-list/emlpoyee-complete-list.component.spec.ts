import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmlpoyeeCompleteListComponent } from './emlpoyee-complete-list.component';

describe('EmlpoyeeCompleteListComponent', () => {
  let component: EmlpoyeeCompleteListComponent;
  let fixture: ComponentFixture<EmlpoyeeCompleteListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmlpoyeeCompleteListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmlpoyeeCompleteListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
