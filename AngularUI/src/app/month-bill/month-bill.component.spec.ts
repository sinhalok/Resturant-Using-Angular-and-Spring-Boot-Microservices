import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MonthBillComponent } from './month-bill.component';

describe('MonthBillComponent', () => {
  let component: MonthBillComponent;
  let fixture: ComponentFixture<MonthBillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MonthBillComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MonthBillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
